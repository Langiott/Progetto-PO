package it.univpm.oop.project.controller;

	/**
	 * Controller for PostMan
	 * @author Andrea and Giuseppe
	 *
	 */
	@RestController
	public class Controller {
		
		/**
		 * The dataservice that provides all the request
		 */
		@Autowired
		private Service service;
		
		
		/**
		 * GET /Metadata
		 * @return all the metadata
		 */
		@GetMapping("/Metadata")
		public ResponseEntity<Object> Metadata(){
			return new ResponseEntity<>(service.getMetadata(),HttpStatus.OK);
		}
		
		
		/**
		 * GET /Data
		 * @return all the data
		 */
		@GetMapping("/Data")
		public ResponseEntity<Object> Data(){
			return new ResponseEntity<>(service.getData(),HttpStatus.OK);	
		}
		
		
		/**
		 * GET /Data(Filter)
		 * @return the data with a filter
		 */
		@GetMapping("/FilterData")
		public ResponseEntity<Object> getData(@RequestBody String filter) throws FormatException, MismatchTypeFilterException, FieldException, OperatorException{
			return new ResponseEntity<>(service.getData(filter),HttpStatus.OK);
				
		}
		
		
		/**
		 * GET /Stats 
		 * @return all the stats
		 */
		@GetMapping("/Stats")
		public ResponseEntity<Object> Stats(){
			return new ResponseEntity<>(service.getStats(),HttpStatus.OK);	
		}
		
		
		/**
		 * GET /Stats(Filter)
		 * @return the stats with a filter
		 */
		@GettMapping("/FilterStats")
		public ResponseEntity<Object> getStatistics(@RequestBody String filter) throws FormatException, MismatchTypeFilterException, FieldException, OperatorException{
			return new ResponseEntity<>(service.getStats(filter),HttpStatus.OK);
				
		}
		
}
