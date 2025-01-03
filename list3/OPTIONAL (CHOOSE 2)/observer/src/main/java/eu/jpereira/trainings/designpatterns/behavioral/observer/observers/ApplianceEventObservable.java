/**
 * Copyright 2011 Joao Miguel Pereira
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package eu.jpereira.trainings.designpatterns.behavioral.observer.observers;

import eu.jpereira.trainings.designpatterns.behavioral.observer.mapper.EventMapper;

/**
 * @author windows
 * 
 */
public interface ApplianceEventObservable {

	/**
	 * Add an observer to the list of object to be notified on ne events
	 * 
	 * @param observer
	 */
	void addObserver(ApplianceEventObserver observer);

	/**
	 * Remove an {@link ApplianceEventObserver} from the observers
	 * 
	 * @param observer
	 */
	void removeObserver(ApplianceEventObserver observer);

}
