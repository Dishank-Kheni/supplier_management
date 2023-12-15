package entity;

import entity.Business;
import entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-12-05T16:56:35")
@StaticMetamodel(Society.class)
public class Society_ { 

    public static volatile SingularAttribute<Society, Date> createdAt;
    public static volatile CollectionAttribute<Society, User> userCollection;
    public static volatile SingularAttribute<Society, String> name;
    public static volatile SingularAttribute<Society, Business> businessId;
    public static volatile SingularAttribute<Society, Integer> id;

}