package entity;

import entity.Business;
import entity.Delivereditem;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-12-05T16:56:35")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Date> createdAt;
    public static volatile SingularAttribute<Product, Integer> price;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Business> businessId;
    public static volatile CollectionAttribute<Product, Delivereditem> delivereditemCollection;
    public static volatile SingularAttribute<Product, Integer> id;

}