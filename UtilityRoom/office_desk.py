from model import furniture

class OfficeDesk(furniture.Furniture):
	def __init__(self):
		super().__init__()
		self.room = "UtilityRoom"
		self.brand = "Desker"
		self.price = 130000
		self.width = 160
		self.depth = 80
		self.height = 73

