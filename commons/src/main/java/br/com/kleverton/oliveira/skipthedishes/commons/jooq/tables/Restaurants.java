/*
 * This file is generated by jOOQ.
 */
package br.com.kleverton.oliveira.skipthedishes.commons.jooq.tables;


import br.com.kleverton.oliveira.skipthedishes.commons.jooq.Indexes;
import br.com.kleverton.oliveira.skipthedishes.commons.jooq.Keys;
import br.com.kleverton.oliveira.skipthedishes.commons.jooq.Skipthedishes;
import br.com.kleverton.oliveira.skipthedishes.commons.jooq.tables.records.RestaurantsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Restaurants extends TableImpl<RestaurantsRecord> {

    private static final long serialVersionUID = 1941287768;

    /**
     * The reference instance of <code>skipthedishes.restaurants</code>
     */
    public static final Restaurants RESTAURANTS = new Restaurants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RestaurantsRecord> getRecordType() {
        return RestaurantsRecord.class;
    }

    /**
     * The column <code>skipthedishes.restaurants.id</code>.
     */
    public final TableField<RestaurantsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>skipthedishes.restaurants.name</code>.
     */
    public final TableField<RestaurantsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>skipthedishes.restaurants.password</code>.
     */
    public final TableField<RestaurantsRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>skipthedishes.restaurants</code> table reference
     */
    public Restaurants() {
        this(DSL.name("restaurants"), null);
    }

    /**
     * Create an aliased <code>skipthedishes.restaurants</code> table reference
     */
    public Restaurants(String alias) {
        this(DSL.name(alias), RESTAURANTS);
    }

    /**
     * Create an aliased <code>skipthedishes.restaurants</code> table reference
     */
    public Restaurants(Name alias) {
        this(alias, RESTAURANTS);
    }

    private Restaurants(Name alias, Table<RestaurantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Restaurants(Name alias, Table<RestaurantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Restaurants(Table<O> child, ForeignKey<O, RestaurantsRecord> key) {
        super(child, key, RESTAURANTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Skipthedishes.SKIPTHEDISHES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RESTAURANTS_PRIMARY, Indexes.RESTAURANTS_RESTAURANTS_NAME_UINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RestaurantsRecord, Long> getIdentity() {
        return Keys.IDENTITY_RESTAURANTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RestaurantsRecord> getPrimaryKey() {
        return Keys.KEY_RESTAURANTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RestaurantsRecord>> getKeys() {
        return Arrays.<UniqueKey<RestaurantsRecord>>asList(Keys.KEY_RESTAURANTS_PRIMARY, Keys.KEY_RESTAURANTS_RESTAURANTS_NAME_UINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Restaurants as(String alias) {
        return new Restaurants(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Restaurants as(Name alias) {
        return new Restaurants(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Restaurants rename(String name) {
        return new Restaurants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Restaurants rename(Name name) {
        return new Restaurants(name, null);
    }
}
