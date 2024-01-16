package DAO;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentDaoImpl implements StudentDao{
    private SessionFactory sf;
    public StudentDaoImpl(SessionFactory sf){
        this.sf = sf;

    }
    @Override
    public void saveStudent(Student student){
        Session session = sf.openSession();
        session.beginTransaction();
        session.persist(student);
        session.getTransaction().commit();
        session.close();
    }

}
