package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//Count Elements Greater Than Previous Average
class Result {
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
    if (responseTimes == null || responseTimes.size() <= 1)
            return 0;

        int count = 0;
        double sum = 0.0;

        for (int i = 0; i < responseTimes.size(); i++) {
            if (i > 0) {
                double avg = sum / i;
                if (responseTimes.get(i) > avg) {
                    count++;
                }
            }
            sum += responseTimes.get(i);
        }

        return count;
    }
}

public class countResponseTimeRegressions {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int responseTimesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> responseTimes = IntStream.range(0, responseTimesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.countResponseTimeRegressions(responseTimes);

        System.out.println(result);

        bufferedReader.close();
    }
}

