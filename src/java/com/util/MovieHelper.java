/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Alejandro
 */
public class MovieHelper {
   
    Session session = null;

    public MovieHelper() {
        this.session = Vidflix.getSessionFactory().getCurrentSession();
    } 
}
