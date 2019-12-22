package apitests;

import apitests.Company;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonMapping {
    public static void main(String[] args) throws IOException {
//        String jsonBody = "{\n" +
//                "                \"company\": \"Goolge\",\n" +
//                "                \"title\": \"Automation\",\n" +
//                "                \"address\":{\n" +
//                "                    \"street\":\"123 N. Main st\",\n" +
//                "                    \"city\": \"Chicago\"\n" +
//                "                }\n" +
//                "            }";

        String listOfJson = "{\n" +
                "                \"company\": \"Goolge\",\n" +
                "                \"title\": \"Automation\",\n" +
                "                \"address\":[\n" +
                "                    {\n" +
                "                        \"street\":\"123 N. Main st\",\n" +
                "                        \"city\": \"Des plaines\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"street\":\"2790 kimball\",\n" +
                "                        \"city\": \"Chicago downtown\"\n" +
                "                    }\n" +
                "                    \n" +
                "                ]\n" +
                "            }";

        ObjectMapper mapper = new ObjectMapper();

        Company company = mapper.readValue(listOfJson, Company.class);

        System.out.println(company.getAddress().get(0).getStreet());
        System.out.println(company.getAddress().get(0).getCity());

        System.out.println(company.getAddress().get(1).getStreet());
        System.out.println(company.getAddress().get(1).getCity());

        System.out.println(company.getTitle());
        System.out.println(company.getCompany());


    }
}
