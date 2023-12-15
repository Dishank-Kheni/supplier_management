package entity;

import entity.Business;
import entity.Delivery;
import entity.Society;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-12-05T16:56:35")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Date> createdAt;
    public static volatile CollectionAttribute<User, Business> businessCollection;
    public static volatile SingularAttribute<User, String> password;
    public static volatile CollectionAttribute<User, Delivery> deliveryCollection;
    public static volatile SingularAttribute<User, Business> businessId;
    public static volatile SingularAttribute<User, Society> societyId;
    public static volatile SingularAttribute<User, String> houseNo;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> mobileNo;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}