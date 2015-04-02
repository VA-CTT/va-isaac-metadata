/*
 * Copyright 2015 kec.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.vha.isaac.metadata.coordinates;

import gov.vha.isaac.metadata.source.IsaacMetadataAuxiliaryBinding;
import gov.vha.isaac.ochre.api.coordinate.StampCoordinate;
import gov.vha.isaac.ochre.api.coordinate.StampPosition;
import gov.vha.isaac.ochre.api.coordinate.StampPrecedence;
import gov.vha.isaac.ochre.model.coordinate.StampCoordinateImpl;
import gov.vha.isaac.ochre.model.coordinate.StampPositionImpl;

/**
 *
 * @author kec
 */
public class StampCoordinates {
    public static StampCoordinate getDevelopmentLatest() {
        StampPosition stampPosition = new StampPositionImpl(Long.MAX_VALUE, 
                IsaacMetadataAuxiliaryBinding.DEVELOPMENT.getSequence());
        int[] moduleSequences = new int[] {};
        return new StampCoordinateImpl(StampPrecedence.PATH, stampPosition, moduleSequences);
    }
    public static StampCoordinate getMasterLatest() {
        StampPosition stampPosition = new StampPositionImpl(Long.MAX_VALUE, 
                IsaacMetadataAuxiliaryBinding.MASTER.getSequence());
        int[] moduleSequences = new int[] {};
        return new StampCoordinateImpl(StampPrecedence.PATH, stampPosition, moduleSequences);
    }
}