package com.onurciner;

import jsqlite.Exception;

/**
 * Created by Onur.Ciner on 25.11.2016.
 */

public class Directional<K> {
    OHibernate oHibernate;
    Class<K> kClass;

    protected Directional(Class<K> kClass) {
        this.kClass = kClass;
        oHibernate = new OHibernate(kClass);
    }

    protected String insert(Object obj) {
        try {
            return oHibernate.insert(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected void update(Object obj) {
        try {
            oHibernate.update(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void delete(Object obj) {
        try {
            oHibernate.delete(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected K select(String key, Object value) {
        try {
            return (K) oHibernate.select(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected K selectAll(String key, Object value) {
        try {
            return (K) oHibernate.selectAll(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
