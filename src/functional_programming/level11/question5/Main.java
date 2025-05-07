
// Simulate a batch job: given a list of jobs (name, status), return only failed job names in uppercase, sorted alphabetically.

package functional_programming.level11.question5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("dataLoad", "SUCCESS"),
                new Job("emailNotification", "FAILED"),
                new Job("cleanup", "FAILED"),
                new Job("backup", "SUCCESS"),
                new Job("reportGeneration", "FAILED")
        );

        List<String> failedJobs = jobs.stream().filter(job->"FAILED".equals(job.getStatus()))
                .map(x->x.getName().toUpperCase())
                .sorted().toList();

        System.out.println("Result: "+failedJobs);
    }
}
