package service;

import entity.Order;

/**
 * Created by user on 20.03.2020.
 */
public class OrderCreator {

    public final static String COUNT_INSTANCE = "testdata.order.count_instance";
    public final static String CLASS_VM = "testdata.order.class_vm";
    public final static String TYPE_INSTANCE = "testdata.order.type_instance";
    public final static String LOCAL_SSD = "testdata.order.local_ssd";
    public final static String REGION = "testdata.order.region";
    public final static String COMMITMENT_TERM = "testdata.order.commintment_term";
    public final static String AMOUNT_RENT = "testdata.order.amount_rent";


    public static Order withDataFromTask() {
        return new Order(DataTestReader.getTestData(COUNT_INSTANCE),
                DataTestReader.getTestData(CLASS_VM),
                DataTestReader.getTestData(TYPE_INSTANCE),
                DataTestReader.getTestData(LOCAL_SSD),
                DataTestReader.getTestData(REGION),
                DataTestReader.getTestData(COMMITMENT_TERM),
                DataTestReader.getTestData(AMOUNT_RENT));
    }
}
