package com.sigarep.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.sigarep.modelo.Profesor;
import com.sigarep.repository.IProfesorDAO;

@Service("sp")
public class ServicioProfesor{
	private @Autowired IProfesorDAO pr = new IProfesorDAO() {
		
		@Override
		public <S extends Profesor> S save(S arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Profesor findOne(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Iterable<Profesor> findAll(Iterable<String> arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean exists(String arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(Iterable<? extends Profesor> arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(Profesor arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Page<Profesor> findAll(Pageable arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Profesor saveAndFlush(Profesor arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends Profesor> List<S> save(Iterable<S> arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void flush() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public List<Profesor> findAll(Sort arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<Profesor> findAll() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void deleteInBatch(Iterable<Profesor> arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAllInBatch() {
			// TODO Auto-generated method stub
			
		}
	};

	public void guardar(Profesor pro) {
		
    pr.save(pro);
	}
	public void actualizar(){
		
	}
	public void eliminar(Profesor pro){
		pr.delete(pro);
	}
	public void buscar(Profesor pro){
	}
}
