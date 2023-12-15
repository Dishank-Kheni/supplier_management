package entity;

import entity.Business;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-12-05T16:56:35")
@StaticMetamodel(Type.class)
public class Type_ { 

    public static volatile SingularAttribute<Type, Date> createdAt;
    public static volatile CollectionAttribute<Type, Business> businessCollection;
    public static volatile SingularAttribute<Type, String> name;
    public static volatile SingularAttribute<Type, Integer> id;

}