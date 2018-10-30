package Apollo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Product")
public class Product {
private ProductSubElement Product;

public ProductSubElement getProduct() {
	return Product;
}

@XmlElement(name="Product",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setProduct(ProductSubElement product) {
	Product = product;
}

@Override
public String toString() {
	return "Product [Product=" + Product + "]";
}

}
