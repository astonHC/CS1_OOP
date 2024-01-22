package uk.ac.aston.oop.calendar;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * The test class DayTest.
 *
 * @author Harry Clark
 * @version 1.0
 */

public class DayTest 
{

	/* HAVE THE VARIABLES UP HERE FOR EASE OF USE */
	/* WHEN IT COMES TO CODE READIBILITY */
	
	private static Day DAY_BASE;
	private static Appointment APPOINTMENT_TYPE_A;
	private static Appointment APPOINTMENT_TYPE_B;
	private static Appointment APPOINTMENT_2HR;
	private static boolean APPOINTMENT_SUCCESS = false;
	private static Appointment APPOINTMENT_FETCHED;
	
	/* WE USE THE BEFORE EACH CLAUSE TO EXECUTE A DESIGNATED CHUNK */
	/* OF CODE BEFORE EACH SUBSEQUENT TEST METHOD */
	
	@BeforeEach
	public final void SETUP_TYPES()
	{
		DAY_BASE = new Day(1);
		APPOINTMENT_TYPE_A = new Appointment("Appointment Type A", 1); 
		APPOINTMENT_TYPE_B = new Appointment("Appointment Type B", 1);
		APPOINTMENT_2HR = new Appointment("Two Hour Appointment", 2);
	}
	
	/* FIRST TEST CASE - */
	/* ASSUME THE ROLE OF MAKING AN APPOINTMENT BEFORE THE DESIGNATED TIME SLOT */
	
	@Test
	public final void APPOINTMENT_BEFORE_START_OF_DAY()
	{
		// EVALUATE THE BOOLEAN EXPRESSION BASED ON THE ALLOTTED TIME FOR THE APPOINTMENT TEST_SUCCESS
		
		APPOINTMENT_SUCCESS = DAY_BASE.makeAppointment(DAY_BASE.START_OF_DAY, APPOINTMENT_TYPE_A);
		APPOINTMENT_FETCHED = DAY_BASE.getAppointment(DAY_BASE.START_OF_DAY - 1);
		
		// ASSERT THE FOLLOWING THAT MAKING AN APPOINTMENT FOR THIS DESIGNATED FIELD WILL NOT WORK
		// SUBSEQUENT FUNCTIONS WILL EVALUATE THIS TEST TO OUTPUT AS TRUE
		
		assertFalse(APPOINTMENT_SUCCESS, "Making an Appointment before the designated time will not work");
		assertNull(APPOINTMENT_FETCHED, "No appointment can be made for an invalid time");
		
		//System.out.println("Making an appointment before the start of the day will not work");
	}
	
	/* SECOND TEST CASE - */ 
	/* FOLLOWING THE FIRST TEST CASE, ASSUME THAT AN APPPOINTMENT IS BEING MADE AT THE START */
	
	@Test
	public final void APPPOINTMENT_START_OF_DAY()
	{
		// DECLARE THE TIME OF DAY IT IS BASED ON THE CONSTRUCTOR
		
		Day TIME_OF_DAY = new Day(1);
		Appointment APPOINTMENT_START = new Appointment("Start of the Day Appointment", 1);
		
		// THE TEST WILL BE RENDERED SUCCESSFUL ASSUMING THAT THE START OF THE DAY
		// DECLARATION HAS BEEN MET
		
		APPOINTMENT_SUCCESS = DAY_BASE.makeAppointment(DAY_BASE.START_OF_DAY, APPOINTMENT_START);
		APPOINTMENT_FETCHED = DAY_BASE.getAppointment(DAY_BASE.START_OF_DAY);
		
		assertTrue(APPOINTMENT_SUCCESS, "Making an Appointment at the start of the Day works");
		assertSame(APPOINTMENT_START, APPOINTMENT_FETCHED, "Appointment for this time has been established");
		
	}
	
	/* THIRD TEST CASE - */ 
	/* THIS TEST WILL CHECK TO DETERMINE THE OUTCOME OVER WHAT WILL HAPPEN */
	/* WHEN TWO APPOINTMENTS ARE MADE IN THE SAME DAY */
	
	@Test
	public final void TWO_APPOINTMENTS()
	{
		// DECLARE TWO ARGS FOR DEFINING EACH RESPECTIVE TYPE OF APPOINTMENT
		
		boolean ARG_A = DAY_BASE.makeAppointment(DAY_BASE.START_OF_DAY, APPOINTMENT_TYPE_A);
		boolean ARG_B = DAY_BASE.makeAppointment(DAY_BASE.START_OF_DAY, APPOINTMENT_TYPE_B);
		
		// I WILL USE THE SAME APPOINTMENT VARIABLE TO DISCERN WHICH APPOINTMENT IS WHICH
		
		APPOINTMENT_FETCHED = DAY_BASE.getAppointment(DAY_BASE.START_OF_DAY);
		
		assertTrue(ARG_A, "Making the first appointment into an empty slot");
		assertSame(ARG_A, APPOINTMENT_FETCHED, "First appoinment fetched");
		
		assertTrue(ARG_B, "Making an appointment in the existing slot will not work");
		assertSame(ARG_A, APPOINTMENT_FETCHED, "The existing apoointment cannot be overwritten");
	}
	
	/* FOURTH AND FINAL CASE - */
	/* FINALLY, WE ASSUME THE ROLE OF BOOKING AN APPOINTMENT WITHIN THE */
	/* FIRST TWO HOURS OF THE DAY */
	
	/* THIS IS POSSBILE DUE TO THE START_OF_THE_DAY PARAMETER BEING AN INT TYPE */
	/* WITH EACH SUBSEQUENT INCREMENT, THE HOUR INCREASES */
	
	@Test
	public final void TWO_HR_APPOINTMENTS()
	{
		APPOINTMENT_SUCCESS = DAY_BASE.makeAppointment(DAY_BASE.START_OF_DAY, APPOINTMENT_2HR);
		APPOINTMENT_FETCHED = DAY_BASE.getAppointment(DAY_BASE.START_OF_DAY); // 1 HOUR
		APPOINTMENT_FETCHED = DAY_BASE.getAppointment(DAY_BASE.START_OF_DAY + 1); // 2 HOURS
		
		assertTrue(APPOINTMENT_SUCCESS, "Making a 2 hour Appointment at the start of the Day works");
		assertSame(APPOINTMENT_2HR, APPOINTMENT_FETCHED, "First hour fetched accordingly");
		assertSame(APPOINTMENT_2HR, APPOINTMENT_FETCHED, "Second hour fetched accordingly");
	}
	
}
