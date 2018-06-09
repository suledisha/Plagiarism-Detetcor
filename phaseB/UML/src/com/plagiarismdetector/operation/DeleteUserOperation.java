/*******************************************************************************
 * Copyright 2018 Team-108
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
/**
 * 
 */
package com.plagiarismdetector.operation;

import com.plagiarismdetector.user.User;

/**
 * a delete user operation
 */
public class DeleteUserOperation implements IOperation {

	/**
	 * user to be deleted
	 */
	private User user;
	/**
	 * @param user
	 */
	public DeleteUserOperation(User user) {
		super();
		this.user = user;
	}

	/**
	 * 
	 */
	public DeleteUserOperation() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.plagiarismdetector.operation.IOperation#perform()
	 */
	@Override
	public Object perform() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 */
	public void setUser(User user) {
		this.user = user;
	}

}