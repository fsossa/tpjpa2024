package jpa;


import java.time.LocalDateTime;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class JpaTest {


	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			EntityManager manager = EntityManagerHelper.getEntityManager();

		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		// Drop and create tables, then insert data
		tx.begin();
		try {
			// manager.createNativeQuery("DROP TABLE IF EXISTS \"PUBLIC\".\"TICKET_USER\" CASCADE").executeUpdate();
			// manager.createNativeQuery("DROP TABLE IF EXISTS \"PUBLIC\".\"ARTIST_CONCERT\" CASCADE").executeUpdate();
			// manager.createNativeQuery("DROP TABLE IF EXISTS Ticket CASCADE").executeUpdate();
			// manager.createNativeQuery("DROP TABLE IF EXISTS Artist CASCADE").executeUpdate();
			// manager.createNativeQuery("DROP TABLE IF EXISTS Concert CASCADE").executeUpdate();
			// manager.createNativeQuery("DROP TABLE IF EXISTS User CASCADE").executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

		// Insert data
		tx.begin();
		try {
			for (int i = 0; i < 2; i++) {
				Admin admin = new Admin("admin"+i, "admin"+i, null, "admin"+i+"@test.xyz", "password"+i);
				manager.persist(admin);
			}

			for (int i = 0; i < 5; i++) {
				Organizer organizer = new Organizer("organizer"+i, "organizer"+i, null, "organizer"+i+"@test.xyz", "password"+i);
				manager.persist(organizer);

				Concert concert = new Concert("Concert "+i, LocalDateTime.now(), "Description du concert "+i, organizer);
				manager.persist(concert);

				Artist artist = new Artist("Artist "+i);
				artist.addConcert(concert);
				manager.persist(artist);

				Ticket ticket = new Ticket("Ticket standard", 100, "available", concert);
				manager.persist(ticket);
			}
			
			for (int i = 0; i < 50; i++) {
				Customer customer = new Customer("CLName"+i, "CFName"+i, "customer"+i+"@test.xyz", "password");
				manager.persist(customer);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

			
   	 manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		System.out.println(".. done");
	}





}
