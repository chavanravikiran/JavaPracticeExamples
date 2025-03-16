package Collection_HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ClinicAppointmentSystem {
    public static void main(String[] args) {
        // Create a HashMap to store Doctor ID and Name
        HashMap<Integer, String> doctorMap = new HashMap<>();

        // 1. Adding doctors to the system
        doctorMap.put(101, "Dr. Smith - Cardiologist");
        doctorMap.put(102, "Dr. Johnson - Neurologist");
        doctorMap.put(103, "Dr. Brown - Dermatologist");

        for (Entry<Integer, String> entry : doctorMap.entrySet()) {
        	System.out.println("Doctor ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}
        
        // 2. Display available doctors
        System.out.println("Available Doctors:");
        doctorMap.forEach((id, name) -> System.out.println("Doctor ID: " + id + ", Name: " + name));

        // 3. Checking if a doctor is available
        int searchId = 102;
        if (doctorMap.containsKey(searchId)) {
            System.out.println("\nDoctor with ID " + searchId + " is available: " + doctorMap.get(searchId));
        } else {
            System.out.println("\nDoctor with ID " + searchId + " is NOT available.");
        }

        // 4. Updating doctor details
        doctorMap.replace(103, "Dr. Brown - Senior Dermatologist");

        // 5. Removing a doctor from the system
        doctorMap.remove(101); // Dr. Smith is no longer available

        // 6. Booking an appointment
        HashMap<Integer, String> appointmentMap = new HashMap<>();
        appointmentMap.put(1001, "Patient: Alice, Doctor: Dr. Johnson - Neurologist");
        appointmentMap.put(1002, "Patient: Bob, Doctor: Dr. Brown - Senior Dermatologist");

        // 7. Displaying all appointments
        System.out.println("\nBooked Appointments:");
        appointmentMap.forEach((id, details) -> System.out.println("Appointment ID: " + id + ", " + details));

        // 8. Checking if a specific appointment exists
        int appointmentId = 1002;
        if (appointmentMap.containsKey(appointmentId)) {
            System.out.println("\nAppointment " + appointmentId + " exists: " + appointmentMap.get(appointmentId));
        }

        // 9. Cancelling an appointment
        appointmentMap.remove(1001);
        System.out.println("\nUpdated Appointments after Cancellation:");
        appointmentMap.forEach((id, details) -> System.out.println("Appointment ID: " + id + ", " + details));

        // 10. Clearing all appointments at the end of the day
        appointmentMap.clear();
        System.out.println("\nAll appointments cleared. Total remaining: " + appointmentMap.size());
    }
}
