package Tablesaw;

import tech.tablesaw.api.Table;

import java.io.IOException;

public class TablesawEDA {
    public static void main(String args[]) {
        try {
            Table titanicData=Table.read().csv("src/main/resources/titanic.csv");
            Table dataStructure= titanicData.structure();
            System.out.println(dataStructure.toString());
            Table summary = titanicData.summary ();
            System.out.println(summary.toString());

            Table dfNumircal = Table.read().csv("src/main/resources/titanic.csv").retainColumns("PassengerId", "Survived", "Pclass","Age");
            Table dfNotNumircal = Table.read().csv("src/main/resources/titanic.csv").retainColumns("Name","Sex","Ticket","Embarked");
            Table mergedDf = dfNumircal.concat(dfNotNumircal);
            System.out.println(mergedDf.toString());


        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
