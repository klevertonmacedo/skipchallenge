/*
 * This file is generated by jOOQ.
 */
package br.com.kleverton.oliveira.skipthedishes.commons.jooq;


import br.com.kleverton.oliveira.skipthedishes.commons.jooq.tables.Accounts;
import br.com.kleverton.oliveira.skipthedishes.commons.jooq.tables.Orders;
import br.com.kleverton.oliveira.skipthedishes.commons.jooq.tables.OrdersProducts;
import br.com.kleverton.oliveira.skipthedishes.commons.jooq.tables.Products;
import br.com.kleverton.oliveira.skipthedishes.commons.jooq.tables.Restaurants;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>skipthedishes</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACCOUNTS_PRIMARY = Indexes0.ACCOUNTS_PRIMARY;
    public static final Index ACCOUNTS_USERNAME = Indexes0.ACCOUNTS_USERNAME;
    public static final Index ORDERS_ID_ACCOUNT = Indexes0.ORDERS_ID_ACCOUNT;
    public static final Index ORDERS_ID_RESTAURANT = Indexes0.ORDERS_ID_RESTAURANT;
    public static final Index ORDERS_PRIMARY = Indexes0.ORDERS_PRIMARY;
    public static final Index ORDERS_PRODUCTS_ID_ORDER = Indexes0.ORDERS_PRODUCTS_ID_ORDER;
    public static final Index ORDERS_PRODUCTS_ID_PRODUCT = Indexes0.ORDERS_PRODUCTS_ID_PRODUCT;
    public static final Index ORDERS_PRODUCTS_PRIMARY = Indexes0.ORDERS_PRODUCTS_PRIMARY;
    public static final Index PRODUCTS_ID_RESTAURANT = Indexes0.PRODUCTS_ID_RESTAURANT;
    public static final Index PRODUCTS_PRIMARY = Indexes0.PRODUCTS_PRIMARY;
    public static final Index RESTAURANTS_PRIMARY = Indexes0.RESTAURANTS_PRIMARY;
    public static final Index RESTAURANTS_RESTAURANTS_NAME_UINDEX = Indexes0.RESTAURANTS_RESTAURANTS_NAME_UINDEX;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ACCOUNTS_PRIMARY = Internal.createIndex("PRIMARY", Accounts.ACCOUNTS, new OrderField[] { Accounts.ACCOUNTS.ID }, true);
        public static Index ACCOUNTS_USERNAME = Internal.createIndex("username", Accounts.ACCOUNTS, new OrderField[] { Accounts.ACCOUNTS.USERNAME }, true);
        public static Index ORDERS_ID_ACCOUNT = Internal.createIndex("id_account", Orders.ORDERS, new OrderField[] { Orders.ORDERS.ID_ACCOUNT }, false);
        public static Index ORDERS_ID_RESTAURANT = Internal.createIndex("id_restaurant", Orders.ORDERS, new OrderField[] { Orders.ORDERS.ID_RESTAURANT }, false);
        public static Index ORDERS_PRIMARY = Internal.createIndex("PRIMARY", Orders.ORDERS, new OrderField[] { Orders.ORDERS.ID }, true);
        public static Index ORDERS_PRODUCTS_ID_ORDER = Internal.createIndex("id_order", OrdersProducts.ORDERS_PRODUCTS, new OrderField[] { OrdersProducts.ORDERS_PRODUCTS.ID_ORDER }, false);
        public static Index ORDERS_PRODUCTS_ID_PRODUCT = Internal.createIndex("id_product", OrdersProducts.ORDERS_PRODUCTS, new OrderField[] { OrdersProducts.ORDERS_PRODUCTS.ID_PRODUCT }, false);
        public static Index ORDERS_PRODUCTS_PRIMARY = Internal.createIndex("PRIMARY", OrdersProducts.ORDERS_PRODUCTS, new OrderField[] { OrdersProducts.ORDERS_PRODUCTS.ID }, true);
        public static Index PRODUCTS_ID_RESTAURANT = Internal.createIndex("id_restaurant", Products.PRODUCTS, new OrderField[] { Products.PRODUCTS.ID_RESTAURANT }, false);
        public static Index PRODUCTS_PRIMARY = Internal.createIndex("PRIMARY", Products.PRODUCTS, new OrderField[] { Products.PRODUCTS.ID }, true);
        public static Index RESTAURANTS_PRIMARY = Internal.createIndex("PRIMARY", Restaurants.RESTAURANTS, new OrderField[] { Restaurants.RESTAURANTS.ID }, true);
        public static Index RESTAURANTS_RESTAURANTS_NAME_UINDEX = Internal.createIndex("restaurants_name_uindex", Restaurants.RESTAURANTS, new OrderField[] { Restaurants.RESTAURANTS.NAME }, true);
    }
}
