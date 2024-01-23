package it.epicode.esercizio.dao;

import it.epicode.esercizio.entities.Evento;
import it.epicode.esercizio.entities.tipoEvento;

import java.time.LocalDate;

public class UsaEventoDao {
    public static void main(String[] args) {
        EventoDao dao=new EventoDao();
        Evento e =new Evento();
        e.setTitolo("viaggio indonesia");
        e.setTipoEvento(tipoEvento.PRIVATO);
        e.setNumeroPartecipanti(8);
        e.setDataEvento(LocalDate.of(2024,10,21));
        Evento e2=new Evento();
        e2.setTitolo("viaggio cambogi");
        e2.setTipoEvento(tipoEvento.PUBBLICO);
        e2.setNumeroPartecipanti(8);
        e2.setDataEvento(LocalDate.of(2024,01,12));

        dao.mostrarEvento(e);
        System.out.println(e);
        dao.mostrarEvento(e2);
        System.out.println(e2);



    }
}
