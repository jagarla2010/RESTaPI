package com.pi4j.exception;

/*
 * #%L
Copyright 2014 Magenta INC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 * #L%
 */

/**
 * @author jean-paul.laberge <moonbeamzebra@magenta.ca>
 * @version 0.1
 * @since January 2014
 */
public class Pi4jException extends RuntimeException {

    private static final long serialVersionUID = 8977677320739411388L;

	public Pi4jException(String problemDetail) {
        super(problemDetail.toString());
    }
	
	   public Pi4jException(String problemDetail, Throwable cause) {
	        super(problemDetail.toString(), cause);
	    }

}
