package sample.webservice;

import sample.webservice.client.StockServiceStub;

public class StockServiceClient {

    public static void main(String args[]) throws Exception {
        StockServiceStub stub = new StockServiceStub ("http://localhost:8080/axis2/services/StockQuoteService");
        getPrice(stub);
        update(stub);
        getPrice(stub);
    }

    public static void update(StockServiceStub stub){
        try{
            stub.update("CDE", new Double(42.35));
            System.err.println("price updated");
        } catch(Exception e){
            e.printStackTrace();
            System.err.println("\n\n\n");
        }
    }

    public static void getPrice(StockServiceStub stub){
        try{
            System.err.println(stub.getPrice("CDE"));
        } catch(Exception e){
            e.printStackTrace();
            System.err.println("\n\n\n");
        }
    }
}
