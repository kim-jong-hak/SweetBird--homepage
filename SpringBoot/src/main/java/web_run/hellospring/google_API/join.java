package web_run.hellospring.google_API;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import static web_run.hellospring.google_API.SheetsQuickstart.*;


public class join {

    public static String[] main() throws IOException, GeneralSecurityException {
          String[] output={"에러","에러",};


        // Build a new authorized API client service.
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        final String spreadsheetId = "14BcWtVuLawmtyw4QOYQkkL5hAEhFbwJfPDNvsiHyDFQ";
        final String range = "sing!B4:C4";
        Sheets service =
                new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                        .setApplicationName(APPLICATION_NAME)
                        .build();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
        } else {

            for (List row : values) {
                // Print columns A and E, which correspond to indices 0 and 4.

                output[0]= row.get(0).toString();
                output[1]=row.get(1).toString();

            }
        }
        return output;
    }
}
