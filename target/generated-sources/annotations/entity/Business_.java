package entity;

import entity.Delivereditem;
import entity.Delivery;
import entity.Product;
import entity.Society;
import entity.Type;
import entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-12-05T16:56:35")
@StaticMetamodel(Business.class)
public class Business_ { 

    public static volatile SingularAttribute<Business, Date> createdAt;
    public static volatile SingularAttribute<Business, String> address;
    public static volatile CollectionAttribute<Business, Delivery> deliveryCollection;
    public static volatile CollectionAttribute<Business, Product> productCollection;
    public static volatile CollectionAttribute<Business, Society> societyCollection;
    public static volatile CollectionAttribute<Business, User> userCollection;
    public static volatile SingularAttribute<Business, String> businessName;
    public static volatile CollectionAttribute<Business, Delivereditem> delivereditemCollection;
    public static volatile SingularAttribute<Business, Type> typeId;
    public static volatile SingularAttribute<Business, Integer> id;
    public static volatile SingularAttribute<Business, User> ownerId;

}