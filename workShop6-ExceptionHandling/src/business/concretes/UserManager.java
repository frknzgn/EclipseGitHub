package business.concretes;

import java.util.ArrayList;
import business.abstracts.UserService;
import core.exceptions.BusinessException;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	

	@Override
	public void add(User user) throws BusinessException {
		if (	  checkeMailExist(user.geteMail())
				&&checkeMailIsReal(user.geteMail())
				&&checkPasswordLength(user.getPassword())
				&&checkName(user.getFirstName())
				&&checkName(user.getLastName())) 
		{
			userDao.add(user);
		}
		
	}

	@Override
	public void update(User user) throws BusinessException {
		if (checkeMailExist(user.geteMail())&&
				checkeMailIsReal(user.geteMail())
				&&checkPasswordLength(user.getPassword())) 
		{
			userDao.update(user);
		}
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	public boolean checkPasswordLength(String password) throws BusinessException {
		
		if (password.length()<6) {
			throw new BusinessException("�ifre 6 karakterden az olamaz.");
		}
		return true;
				
	}

	public boolean checkeMailIsReal(String eMail) throws BusinessException {
		if(eMail.contains("@")) {
			return true;
		}
		throw new BusinessException("Ge�erli bir e posta adresi girin.");
		
	}
	
	public boolean checkeMailExist(String eMail) throws BusinessException {
		if (userDao.eMailGetAll().contains(eMail)) {
			throw new BusinessException("Kay�tl� eMail.");
		}
		return true;
	}
	

	public boolean checkName(String name) throws BusinessException {
		if (name.length()<2) {
			throw new BusinessException("Ad ve soyad en az iki�er karakterden olu�mal�d�r.");
		}
		return true;
		
	}


	@Override
	public ArrayList<String> eMailGetAll() {
		return null;
	}

}
