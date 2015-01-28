/*!
 * PENTAHO CORPORATION PROPRIETARY AND CONFIDENTIAL
 *
 * Copyright 2002 - 2015 Pentaho Corporation (Pentaho). All rights reserved.
 *
 * NOTICE: All information including source code contained herein is, and
 * remains the sole property of Pentaho and its licensors. The intellectual
 * and technical concepts contained herein are proprietary and confidential
 * to, and are trade secrets of Pentaho and may be covered by U.S. and foreign
 * patents, or patents in process, and are protected by trade secret and
 * copyright laws. The receipt or possession of this source code and/or related
 * information does not convey or imply any rights to reproduce, disclose or
 * distribute its contents, or to manufacture, use, or sell anything that it
 * may describe, in whole or in part. Any reproduction, modification, distribution,
 * or public display of this information without the express written authorization
 * from Pentaho is strictly prohibited and in violation of applicable laws and
 * international treaties. Access to the source code contained herein is strictly
 * prohibited to anyone except those individuals and entities who have executed
 * confidentiality and non-disclosure agreements or other agreements with Pentaho,
 * explicitly covering such access.
 */

package com.pentaho.metrics.api;

import com.pentaho.profiling.api.ProfileFieldProperty;

import java.util.Arrays;

/**
 * Created by mhall on 25/01/15.
 */
public class MetricContributorUtils {

  public static final String TYPE = "type";
  public static final String FIELD_NOT_FOUND = "Expected field was not found: ";
  public static final String STATISTICS = "statistics";
  public static final String COUNT = "count";
  public static final String CATEGORIES = "categories";
  public static final String CATEGORICAL = "categorical";

  public static ProfileFieldProperty createMetricProperty( String keyPath, String nameKey, String... metricPath ) {
    String[] fullPath = new String[metricPath.length + 1];
    fullPath[0] = TYPE;
    for ( int i = 0; i < metricPath.length; i++ ) {
      fullPath[i + 1] = metricPath[i];
    }
    return new ProfileFieldProperty( keyPath, nameKey, Arrays.asList( fullPath ) );
  }
}
