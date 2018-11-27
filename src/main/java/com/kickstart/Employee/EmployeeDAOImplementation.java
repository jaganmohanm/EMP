package com.kickstart.Employee;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDAOImplementation implements EmployeeDAO {

private SessionFactory sf;
private EmployeeDAO ed;

public void setEd(EmployeeDAO ed) {
	this.ed = ed;
}
public void setSf(SessionFactory sf) {
	this.sf = sf;
}
@Override
public void save(EmpPojo ep)
{
	System.out.println(ep);
Session s=this.sf.openSession();
Transaction t=s.beginTransaction();
System.out.println(ep);
s.persist(ep);
t.commit();
s.close();

}

@SuppressWarnings("unchecked")
@Override
public List<EmpPojo> select()
		{
	Session s=this.sf.openSession();
	List<EmpPojo> l=s.createQuery("from Emp_Pojo").list();
	System.out.println(l);
	
	
	s.close();
	
	return l;
		}



}

