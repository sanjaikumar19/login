package com.niit.DAO;

import java.util.List;

import com.niit.model.Supplier;

public interface SupplierDAO {

public boolean addSupplier(Supplier supplier);
public boolean deleteCategory(Supplier supplier);
public boolean updateCategory(Supplier supplier);
public List<Supplier> listSuppliers();
public Supplier getSupplier(int SupplierId);

}
