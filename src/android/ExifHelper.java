/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
*/
package org.apache.cordova.camera;

import java.io.IOException;

import androidx.exifinterface.media.ExifInterface;

import org.apache.cordova.LOG;

public class ExifHelper {
    private static final String LOG_TAG = "EXIF Helper";

    private String aperture = null;
    private String datetime = null;
    private String dateTimeOriginal = null;
    private String exposureTime = null;
    private String flash = null;
    private String focalLength = null;
    private String gpsAltitude = null;
    private String gpsAltitudeRef = null;
    private String gpsDateStamp = null;
    private String gpsLatitude = null;
    private String gpsLatitudeRef = null;
    private String gpsLongitude = null;
    private String gpsLongitudeRef = null;
    private String gpsProcessingMethod = null;
    private String gpsTimestamp = null;
    private String iso = null;
    private String make = null;
    private String model = null;
    private String orientation = null;
    private String whiteBalance = null;
    private String software = null;
    private String artist = null;
    private String copyright = null;
    private String imageDescription = null;
    private String userComment = null;

    private ExifInterface inFile = null;
    private ExifInterface outFile = null;

    /**
     * The file before it is compressed
     *
     * @param filePath
     * @throws IOException
     */
    public void createInFile(String filePath) throws IOException {
        this.inFile = new ExifInterface(filePath);
    }

    /**
     * The file after it has been compressed
     *
     * @param filePath
     * @throws IOException
     */
    public void createOutFile(String filePath) throws IOException {
        this.outFile = new ExifInterface(filePath);
    }

    /**
     * Reads all the EXIF data from the input file.
     */
    public void readExifData() {
        this.aperture = inFile.getAttribute(ExifInterface.TAG_F_NUMBER);
        this.datetime = inFile.getAttribute(ExifInterface.TAG_DATETIME);
        this.dateTimeOriginal = inFile.getAttribute(ExifInterface.TAG_DATETIME_ORIGINAL);
        this.exposureTime = inFile.getAttribute(ExifInterface.TAG_EXPOSURE_TIME);
        this.flash = inFile.getAttribute(ExifInterface.TAG_FLASH);
        this.focalLength = inFile.getAttribute(ExifInterface.TAG_FOCAL_LENGTH);
        this.gpsAltitude = inFile.getAttribute(ExifInterface.TAG_GPS_ALTITUDE);
        this.gpsAltitudeRef = inFile.getAttribute(ExifInterface.TAG_GPS_ALTITUDE_REF);
        this.gpsDateStamp = inFile.getAttribute(ExifInterface.TAG_GPS_DATESTAMP);
        this.gpsLatitude = inFile.getAttribute(ExifInterface.TAG_GPS_LATITUDE);
        this.gpsLatitudeRef = inFile.getAttribute(ExifInterface.TAG_GPS_LATITUDE_REF);
        this.gpsLongitude = inFile.getAttribute(ExifInterface.TAG_GPS_LONGITUDE);
        this.gpsLongitudeRef = inFile.getAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF);
        this.gpsProcessingMethod = inFile.getAttribute(ExifInterface.TAG_GPS_PROCESSING_METHOD);
        this.gpsTimestamp = inFile.getAttribute(ExifInterface.TAG_GPS_TIMESTAMP);
        this.iso = inFile.getAttribute(ExifInterface.TAG_ISO_SPEED_RATINGS);
        this.make = inFile.getAttribute(ExifInterface.TAG_MAKE);
        this.model = inFile.getAttribute(ExifInterface.TAG_MODEL);
        this.orientation = inFile.getAttribute(ExifInterface.TAG_ORIENTATION);
        this.whiteBalance = inFile.getAttribute(ExifInterface.TAG_WHITE_BALANCE);
        this.software = inFile.getAttribute(ExifInterface.TAG_SOFTWARE);
        this.artist = inFile.getAttribute(ExifInterface.TAG_ARTIST);
        this.copyright = inFile.getAttribute(ExifInterface.TAG_COPYRIGHT);
        this.imageDescription = inFile.getAttribute(ExifInterface.TAG_IMAGE_DESCRIPTION);
        this.userComment = inFile.getAttribute(ExifInterface.TAG_USER_COMMENT);
    }

    /**
     * Writes the previously stored EXIF data to the output file.
     *
     * @throws IOException
     */
    public void writeExifData() throws IOException {
        // Don't try to write to a null file
        if (this.outFile == null) {
            return;
        }

        if (this.aperture != null) {
            this.outFile.setAttribute(ExifInterface.TAG_F_NUMBER, this.aperture);
        }
        if (this.datetime != null) {
            this.outFile.setAttribute(ExifInterface.TAG_DATETIME, this.datetime);
        }
        if (this.dateTimeOriginal != null) {
            this.outFile.setAttribute(ExifInterface.TAG_DATETIME_ORIGINAL, this.dateTimeOriginal);
        }
        if (this.exposureTime != null) {
            this.outFile.setAttribute(ExifInterface.TAG_EXPOSURE_TIME, this.exposureTime);
        }
        if (this.flash != null) {
            this.outFile.setAttribute(ExifInterface.TAG_FLASH, this.flash);
        }
        if (this.focalLength != null) {
            this.outFile.setAttribute(ExifInterface.TAG_FOCAL_LENGTH, this.focalLength);
        }
        if (this.gpsAltitude != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_ALTITUDE, this.gpsAltitude);
        }
        if (this.gpsAltitudeRef != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_ALTITUDE_REF, this.gpsAltitudeRef);
        }
        if (this.gpsDateStamp != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_DATESTAMP, this.gpsDateStamp);
        }
        if (this.gpsLatitude != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_LATITUDE, this.gpsLatitude);
        }
        if (this.gpsLatitudeRef != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_LATITUDE_REF, this.gpsLatitudeRef);
        }
        if (this.gpsLongitude != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_LONGITUDE, this.gpsLongitude);
        }
        if (this.gpsLongitudeRef != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF, this.gpsLongitudeRef);
        }
        if (this.gpsProcessingMethod != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_PROCESSING_METHOD, this.gpsProcessingMethod);
        }
        if (this.gpsTimestamp != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_TIMESTAMP, this.gpsTimestamp);
        }
        if (this.iso != null) {
            this.outFile.setAttribute(ExifInterface.TAG_ISO_SPEED_RATINGS, this.iso);
        }
        if (this.make != null) {
            this.outFile.setAttribute(ExifInterface.TAG_MAKE, this.make);
        }
        if (this.model != null) {
            this.outFile.setAttribute(ExifInterface.TAG_MODEL, this.model);
        }
        if (this.orientation != null) {
            this.outFile.setAttribute(ExifInterface.TAG_ORIENTATION, this.orientation);
        }
        if (this.whiteBalance != null) {
            this.outFile.setAttribute(ExifInterface.TAG_WHITE_BALANCE, this.whiteBalance);
        }
        if (this.software != null) {
            this.outFile.setAttribute(ExifInterface.TAG_SOFTWARE, this.software);
        }
        if (this.artist != null) {
            this.outFile.setAttribute(ExifInterface.TAG_ARTIST, this.artist);
        }
        if (this.copyright != null) {
            this.outFile.setAttribute(ExifInterface.TAG_COPYRIGHT, this.copyright);
        }
        if (this.imageDescription != null) {
            this.outFile.setAttribute(ExifInterface.TAG_IMAGE_DESCRIPTION, this.imageDescription);
        }
        if (this.userComment != null) {
            this.outFile.setAttribute(ExifInterface.TAG_USER_COMMENT, this.userComment);
        }

        this.outFile.saveAttributes();
    }

    public int getOrientation() {
        if (this.orientation == null) {
            return 0;
        }

        try {
            int o = Integer.parseInt(this.orientation);

            if (o == ExifInterface.ORIENTATION_NORMAL) {
                return 0;
            } else if (o == ExifInterface.ORIENTATION_ROTATE_90) {
                return 90;
            } else if (o == ExifInterface.ORIENTATION_ROTATE_180) {
                return 180;
            } else if (o == ExifInterface.ORIENTATION_ROTATE_270) {
                return 270;
            } else {
                return 0;
            }
        } catch (NumberFormatException e) {
            LOG.w(LOG_TAG, "Invalid orientation value: " + this.orientation);
            return 0;
        }
    }

    public void resetOrientation() {
        this.orientation = "" + ExifInterface.ORIENTATION_NORMAL;
    }

    /**
     * Check if GPS data exists in the image
     * @return true if GPS latitude and longitude exist, false otherwise
     */
    public boolean hasGpsData() {
        return this.gpsLatitude != null && this.gpsLongitude != null;
    }

    /**
     * Set GPS coordinates in the output file
     * @param latitude latitude in decimal degrees
     * @param longitude longitude in decimal degrees
     */
    public void setGpsCoordinates(double latitude, double longitude) {
        // Convert decimal degrees to degrees, minutes, seconds format
        String latRef = latitude >= 0 ? "N" : "S";
        String lonRef = longitude >= 0 ? "E" : "W";

        // Convert to absolute values for calculation
        double absLat = Math.abs(latitude);
        double absLon = Math.abs(longitude);

        // Convert to degrees, minutes, seconds
        int latDegrees = (int) absLat;
        int latMinutes = (int) ((absLat - latDegrees) * 60);
        double latSeconds = ((absLat - latDegrees - (latMinutes / 60.0)) * 3600);

        int lonDegrees = (int) absLon;
        int lonMinutes = (int) ((absLon - lonDegrees) * 60);
        double lonSeconds = ((absLon - lonDegrees - (lonMinutes / 60.0)) * 3600);

        // Format as rational numbers (numerator/denominator)
        this.gpsLatitude = latDegrees + "/1," + latMinutes + "/1," + (int)(latSeconds * 1000) + "/1000";
        this.gpsLongitude = lonDegrees + "/1," + lonMinutes + "/1," + (int)(lonSeconds * 1000) + "/1000";
        this.gpsLatitudeRef = latRef;
        this.gpsLongitudeRef = lonRef;

        LOG.d(LOG_TAG, "GPS coordinates set - Latitude: " + latitude + " (" + this.gpsLatitude + " " + this.gpsLatitudeRef +
              "), Longitude: " + longitude + " (" + this.gpsLongitude + " " + this.gpsLongitudeRef + ")");
    }

    /**
     * Get GPS latitude
     * @return GPS latitude string or null if not set
     */
    public String getGpsLatitude() {
        return this.gpsLatitude;
    }

    /**
     * Get GPS longitude
     * @return GPS longitude string or null if not set
     */
    public String getGpsLongitude() {
        return this.gpsLongitude;
    }

    /**
     * Get GPS latitude reference
     * @return GPS latitude reference string or null if not set
     */
    public String getGpsLatitudeRef() {
        return this.gpsLatitudeRef;
    }

    /**
     * Get GPS longitude reference
     * @return GPS longitude reference string or null if not set
     */
    public String getGpsLongitudeRef() {
        return this.gpsLongitudeRef;
    }
}
