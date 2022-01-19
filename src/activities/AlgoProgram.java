package activities;

import utility.People;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import static utility.Module.quickSort;

public class AlgoProgram {

    public static void main(String[] args) throws IOException{
        People p1 = new People(11, "Susan", "Smith");
        People p2 = new People(11, "Donald", "Trump");
        People p3 = new People (11, "Joe", "Biden");
        People p4 = new People(11,"John", "Wick");
        People p5 = new People(22, "Tran","Nguyen");
        People p6 = new People(22,"Ha","Nguyen");
        People p7 = new People(22,"An","Nguyen");
        People p8 = new People(19,"Minh","Le");
        People p9 = new People(23,"James","Bond");
        People p10 = new People(25,"Quynh","Tran");
        People[] arrP = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};

        String location = "output" + File.separator + "SortedList.txt";

        //Object to append list
        StringBuilder result = new StringBuilder();
        result.append("Before sorting:\n");
        for (int i = 0; i < arrP.length; i++) {
            result.append(arrP[i].toString());
            result.append("\n");
        }

        quickSort(arrP);
        result.append("\nAfter sorting:\n");
        for (int i = 0; i < arrP.length; i++) {
            result.append(arrP[i].toString());
            result.append("\n");
        }
        write(location,result);
    }

    public static void write(String location, StringBuilder builder) throws IOException {
        File file           = new File(location);
        PrintWriter writer  = new PrintWriter(file);

        writer.println(builder);
        writer.close();
    }
}
