package productDisplay2

class Product {
	var id: String? = null
	var name: String? = null
	var category: String? = null
 
	constructor() {}
	constructor(id: String?, name: String?, category: String?) {
		this.id = id
		this.name = name
		this.category = category
	}
	
}