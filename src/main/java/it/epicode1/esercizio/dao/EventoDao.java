package it.epicode.esercizio.dao;

import it.epicode.esercizio.entities.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EventoDao {
    private EntityManagerFactory emf;
    private EntityManager em;
 public EventoDao(){
     emf = Persistence.createEntityManagerFactory("gestioneeventi");
     em= emf.createEntityManager();
 }

 public Evento mostrarEvento(Evento e){
     EntityTransaction et=em.getTransaction();
     et.begin();
     em.persist(e);
     et.commit();
     em.refresh(e);
     return e;
 }
 public Evento getById(int id){
return em.find(Evento.class, id);
 }

 public void deleteEvento(int id){

     EntityTransaction et=em.getTransaction();
     et.begin();
     Evento e=getById(id);
     em.remove(e);
     et.commit();
 }
}

