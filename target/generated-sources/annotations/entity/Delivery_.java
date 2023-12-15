package entity;

import entity.Business;
import entity.Delivereditem;
import entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-12-05T16:56:35")
@StaticMetamodel(Delivery.class)
public class Delivery_ { 

    public static volatile SingularAttribute<Delivery, Date> createdAt;
    public static volatile SingularAttribute<Delivery, Business> businessId;
    public static volatile SingularAttribute<Delivery, User> customerId;
    public static volatile CollectionAttribute<Delivery, Delivereditem> delivereditemCollection;
    public static volatile SingularAttribute<Delivery, Integer> id;

}