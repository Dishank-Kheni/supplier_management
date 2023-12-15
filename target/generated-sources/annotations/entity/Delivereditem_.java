package entity;

import entity.Business;
import entity.Delivery;
import entity.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-12-05T16:56:35")
@StaticMetamodel(Delivereditem.class)
public class Delivereditem_ { 

    public static volatile SingularAttribute<Delivereditem, Date> createdAt;
    public static volatile SingularAttribute<Delivereditem, Delivery> deliveryId;
    public static volatile SingularAttribute<Delivereditem, Integer> quantity;
    public static volatile SingularAttribute<Delivereditem, Product> productId;
    public static volatile SingularAttribute<Delivereditem, Integer> price;
    public static volatile SingularAttribute<Delivereditem, String> name;
    public static volatile SingularAttribute<Delivereditem, Business> businessId;
    public static volatile SingularAttribute<Delivereditem, Integer> id;

}