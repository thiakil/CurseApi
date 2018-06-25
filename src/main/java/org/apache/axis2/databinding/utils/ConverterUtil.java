/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.axis2.databinding.utils;

import java.util.*;

/**
 * Calendar conversion code copied from Axis2 since Curse still use the same time format.
 */
public class ConverterUtil {

    public static void appendTimeZone(Calendar calendar, StringBuffer dateString) {
        int timezoneOffSet = calendar.get(Calendar.ZONE_OFFSET) + calendar.get(Calendar.DST_OFFSET);
        int timezoneOffSetInMinits = timezoneOffSet / 60000;
        if (timezoneOffSetInMinits < 0){
            dateString.append("-");
            timezoneOffSetInMinits = timezoneOffSetInMinits * -1;
        } else {
            dateString.append("+");
        }
        int hours = timezoneOffSetInMinits / 60;
        int minits = timezoneOffSetInMinits % 60;

        if (hours < 10) {
            dateString.append("0");
        }
        dateString.append(hours).append(":");

        if (minits < 10){
            dateString.append("0");
        }

        dateString.append(minits);
    }

    public static void appendDate(StringBuffer dateString, Calendar calendar) {

        int year = calendar.get(Calendar.YEAR);

        if (year < 1000){
            dateString.append("0");
        }
        if (year < 100){
            dateString.append("0");
        }
        if (year < 10) {
            dateString.append("0");
        }
        dateString.append(year).append("-");

        // xml date month is started from 1 and calendar month is
        // started from 0. so have to add one
        int month = calendar.get(Calendar.MONTH) + 1;
        if (month < 10){
            dateString.append("0");
        }
        dateString.append(month).append("-");
        if (calendar.get(Calendar.DAY_OF_MONTH) < 10){
            dateString.append("0");
        }
        dateString.append(calendar.get(Calendar.DAY_OF_MONTH));
    }

    public static String convertToString(Calendar value) {

        // lexical form of the calendar is '-'? yyyy '-' mm '-' dd 'T' hh ':' mm ':' ss ('.' s+)? (zzzzzz)?
        if (value.get(Calendar.ZONE_OFFSET) == -1){
            value.setTimeZone(TimeZone.getDefault());
        }
        StringBuffer dateString = new StringBuffer(28);
        appendDate(dateString, value);
        dateString.append("T");
        //adding hours
        appendTime(value, dateString);
        appendTimeZone(value, dateString);
        return dateString.toString();

    }

    public static void appendTime(Calendar value, StringBuffer dateString) {
        if (value.get(Calendar.HOUR_OF_DAY) < 10) {
            dateString.append("0");
        }
        dateString.append(value.get(Calendar.HOUR_OF_DAY)).append(":");
        if (value.get(Calendar.MINUTE) < 10) {
            dateString.append("0");
        }
        dateString.append(value.get(Calendar.MINUTE)).append(":");
        if (value.get(Calendar.SECOND) < 10) {
            dateString.append("0");
        }
        dateString.append(value.get(Calendar.SECOND)).append(".");
        if (value.get(Calendar.MILLISECOND) < 10) {
            dateString.append("0");
        }
        if (value.get(Calendar.MILLISECOND) < 100) {
            dateString.append("0");
        }
        dateString.append(value.get(Calendar.MILLISECOND));
    }


    /**
     * Code from Axis1 code base Note - We only follow the convention in the latest schema spec
     *
     * @param source
     * @return Returns Calendar.
     */
    public static Calendar convertToDateTime(String source) {

        if ((source == null) || source.trim().equals("")) {
            return null;
        }
        source = source.trim();
        // the lexical representation of the date time as follows
        // '-'? yyyy '-' mm '-' dd 'T' hh ':' mm ':' ss ('.' s+)? (zzzzzz)?
        Date date = null;
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setLenient(false);


        if (source.startsWith("-")) {
            source = source.substring(1);
            calendar.set(Calendar.ERA, GregorianCalendar.BC);
        }

        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minite = 0;
        int second = 0;
        long miliSecond = 0;
        int timeZoneOffSet = TimeZone.getDefault().getRawOffset();
        boolean haveTimeZone;


        if ((source != null) && (source.length() >= 19)) {
            if ((source.charAt(4) != '-') ||
                    (source.charAt(7) != '-') ||
                    (source.charAt(10) != 'T') ||
                    (source.charAt(13) != ':') ||
                    (source.charAt(16) != ':')) {
                throw new RuntimeException("invalid date format (" + source + ") with out - s at correct place ");
            }
            year = Integer.parseInt(source.substring(0, 4));
            month = Integer.parseInt(source.substring(5, 7));
            day = Integer.parseInt(source.substring(8, 10));
            hour = Integer.parseInt(source.substring(11, 13));
            minite = Integer.parseInt(source.substring(14, 16));
            second = Integer.parseInt(source.substring(17, 19));

            int milliSecondPartLength = 0;

            if (source.length() == 19) {
                haveTimeZone = false;
            } else {
                String rest = source.substring(19);
                if (rest.startsWith(".")) {
                    // i.e this have the ('.'s+) part
                    if (rest.endsWith("Z")) {
                        // this is in gmt time zone
                        haveTimeZone = true;
                        timeZoneOffSet = 0;
                        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
                        miliSecond = Integer.parseInt(rest.substring(1, rest.lastIndexOf("Z")));
                        milliSecondPartLength = rest.substring(1,rest.lastIndexOf("Z")).trim().length();
                    } else if ((rest.lastIndexOf("+") > 0) || (rest.lastIndexOf("-") > 0)) {
                        // this is given in a general time zione
                        haveTimeZone = true;
                        String timeOffSet = null;
                        if (rest.lastIndexOf("+") > 0) {
                            timeOffSet = rest.substring(rest.lastIndexOf("+") + 1);
                            miliSecond = Integer.parseInt(rest.substring(1, rest.lastIndexOf("+")));
                            milliSecondPartLength = rest.substring(1, rest.lastIndexOf("+")).trim().length();
                            // we keep +1 or -1 to finally calculate the value
                            timeZoneOffSet = 1;

                        } else if (rest.lastIndexOf("-") > 0) {
                            timeOffSet = rest.substring(rest.lastIndexOf("-") + 1);
                            miliSecond = Integer.parseInt(rest.substring(1, rest.lastIndexOf("-")));
                            milliSecondPartLength = rest.substring(1, rest.lastIndexOf("-")).trim().length();
                            // we keep +1 or -1 to finally calculate the value
                            timeZoneOffSet = -1;
                        }
                        if (timeOffSet.charAt(2) != ':') {
                            throw new RuntimeException("invalid time zone format (" + source
                                    + ") without : at correct place");
                        }
                        int hours = Integer.parseInt(timeOffSet.substring(0, 2));
                        int minits = Integer.parseInt(timeOffSet.substring(3, 5));
                        timeZoneOffSet = ((hours * 60) + minits) * 60000 * timeZoneOffSet;

                    } else {
                        // i.e it does not have time zone
                        haveTimeZone = false;
                        miliSecond = Integer.parseInt(rest.substring(1));
                        milliSecondPartLength = rest.substring(1).trim().length();
                    }

                } else {
                    if (rest.startsWith("Z")) {
                        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
                        // this is in gmt time zone
                        haveTimeZone = true;
                        timeZoneOffSet = 0;
                    } else if (rest.startsWith("+") || rest.startsWith("-")) {
                        // this is given in a general time zione
                        haveTimeZone = true;
                        if (rest.charAt(3) != ':') {
                            throw new RuntimeException("invalid time zone format (" + source
                                    + ") without : at correct place");
                        }
                        int hours = Integer.parseInt(rest.substring(1, 3));
                        int minits = Integer.parseInt(rest.substring(4, 6));
                        timeZoneOffSet = ((hours * 60) + minits) * 60000;
                        if (rest.startsWith("-")) {
                            timeZoneOffSet = timeZoneOffSet * -1;
                        }
                    } else {
                        throw new NumberFormatException("in valid time zone attribute");
                    }
                }
            }
            calendar.set(Calendar.YEAR, year);
            // xml month is started from 1 and calendar month is started from 0
            calendar.set(Calendar.MONTH, month - 1);
            calendar.set(Calendar.DAY_OF_MONTH, day);
            calendar.set(Calendar.HOUR_OF_DAY, hour);
            calendar.set(Calendar.MINUTE, minite);
            calendar.set(Calendar.SECOND, second);
            if (milliSecondPartLength != 3){
                // milisecond part represenst the fraction of the second so we have to
                // find the fraction and multiply it by 1000. So if milisecond part
                // has three digits nothing required
                miliSecond = miliSecond * 1000;
                for (int i = 0; i < milliSecondPartLength; i++) {
                    miliSecond = miliSecond / 10;
                }
            }
            calendar.set(Calendar.MILLISECOND, (int)miliSecond);
            calendar.set(Calendar.ZONE_OFFSET, timeZoneOffSet);
            // set the day light offset only if the time zone is present
            // set the day light offset only if the time zone is present
            if (haveTimeZone) {
                calendar.set(Calendar.DST_OFFSET, 0);
            }


        } else {
            throw new NumberFormatException("date string can not be less than 19 characters");
        }

        return calendar;
    }

}
