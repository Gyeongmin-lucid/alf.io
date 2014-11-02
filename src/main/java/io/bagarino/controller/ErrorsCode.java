/**
 * This file is part of bagarino.
 *
 * bagarino is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * bagarino is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with bagarino.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.bagarino.controller;

public interface ErrorsCode {

	String STEP_1_SELECT_AT_LEAST_ONE = "error.STEP_1_SELECT_AT_LEAST_ONE";
	String STEP_1_OVER_MAXIMUM = "error.STEP_1_OVER_MAXIMUM";
	String STEP_1_TICKET_CATEGORY_MUST_BE_SALEABLE = "error.STEP_1_TICKET_CATEGORY_MUST_BE_SALEABLE";
	String STEP_1_ACCESS_RESTRICTED = "error.STEP_1_ACCESS_RESTRICTED";
	String STEP_1_NOT_ENOUGH_TICKETS = "error.STEP_1_NOT_ENOUGH_TICKETS";
	
	String STEP_2_PAYMENT_PROCESSING_ERROR = "error.STEP_2_PAYMENT_PROCESSING_ERROR";
	
	String STEP_2_ORDER_EXPIRED = "error.STEP_2_ORDER_HAS_EXPIRED";
	
	
	String STEP_2_MISSING_STRIPE_TOKEN = "error.STEP_2_MISSING_STRIPE_TOKEN";
	String STEP_2_EMPTY_EMAIL = "error.STEP_2_EMPTY_EMAIL";
	String STEP_2_MAX_LENGTH_EMAIL ="error.STEP_2_EMAIL_IS_TOO_LONG";
	String STEP_2_INVALID_EMAIL = "error.STEP_2_INVALID_EMAIL";
	String STEP_2_EMPTY_FULLNAME = "error.STEP_2_EMPTY_FULLNAME";
	String STEP_2_MAX_LENGTH_FULLNAME = "error.STEP_2_MAX_LENGTH_FULLNAME";
	String STEP_2_MAX_LENGTH_BILLING_ADDRESS = "error.STEP_2_MAX_LENGTH_BILLING_ADDRESS";
}