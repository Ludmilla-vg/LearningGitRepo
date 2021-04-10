package nz.co.Framework.HelperClasses;

import cucumber.api.DataTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DataTableHelper {
    public static DataTable createDataTableWithoutHeadersUsingList(List<List<String>> listValues) {
        List<List<String>> dataList = new ArrayList<>();
        for (List<String> data : listValues) {
            dataList.add(data);
        }
        System.out.println("The first table is =>"+ dataList);
        return DataTable.create(dataList);
    }

    public static DataTable createDataTableWithHeadersUsingList(List<List<String>> listValues) {
        List<List<String>> dataList = new ArrayList<>();
        //get the number of cells in row 0
        int size  = listValues.get(0).size();

        List<String> individualCellForRow0 = new ArrayList<>();
        for (int i=0;i<size;i++){
            individualCellForRow0.add("");
        }
        dataList.add(individualCellForRow0);

        for (List<String> data : listValues) {
            dataList.add(data);
        }
        System.out.println("The second table is =>"+ dataList);
        return DataTable.create(dataList);
    }
}
