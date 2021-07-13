package journy;

import joinery.DataFrame;

import java.io.IOException;

public class JournyEDA {
    public static void main(String args[]){
        try {
            DataFrame<Object>  dfNumircal= DataFrame.readCsv ("E:\\Ahmed programming\\ITI\\Java &UML programming\\Java_and_UML_ITI_Assigments\\Titanic_EDA\\src\\main\\resources\\titanic.csv");
            dfNumircal = dfNumircal.retain("Survived", "Pclass", "Age","SibSp","Parch","Fare");
            DataFrame<Object> describe =dfNumircal.describe ();
            System. out.println(describe.toString());

            System.out.println ("=========================================================================================");

            //Make another seprated data frames then merge between it and dfNumircal in a new data frame called dfTitanic
            DataFrame<Object> dfNotNumircal= DataFrame.readCsv ("E:\\Ahmed programming\\ITI\\Java &UML programming\\Java_and_UML_ITI_Assigments\\Titanic_EDA\\src\\main\\resources\\titanic.csv");
            dfNotNumircal = dfNotNumircal.retain("PassengerId","Name","Sex");

            DataFrame<Object> dfTitanic = dfNotNumircal.join(dfNumircal);

            dfTitanic.iterrows ().forEachRemaining (System. out::println);

        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
