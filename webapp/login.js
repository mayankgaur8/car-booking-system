import React,{Component} from 'react';
import './login.css';
import axios from 'axios';
export default class login extends Component{

    constructor(props){
    	super(props);
    		this.sate={
    			user:[]	
    		
    	};
    }
    componentDidMount(){
    	axios.get("http://localhost:8081/user/show-cab-users")
    	.then(response => response.data);
    	.then((data)=> {
    		this.setState({user:data});
    	});
    }
	render(){
        return(
            <div>
        <meta charSet="utf-8" />
        <meta httpEquiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        {/* The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags */}
        <title>Booking Form HTML Template</title>
        {/* Google font */}
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" />
        {/* Bootstrap */}
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />
        {/* Custom stlylesheet */}
        <link type="text/css" rel="stylesheet" href="css/login.css" />
        {/* HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries */}
        {/* WARNING: Respond.js doesn't work if you view the page via file:// */}
        {/*[if lt IE 9]>
		  
		  
		<![endif]*/}
        <div id="booking" className="section">
          <div className="section-center">
            <div className="container">
              <div className="row">
                <div className="booking-form">
                  <div className="form-header">
                    <h1>Avantika Booking  Car Service</h1>
                  </div>
                  <form>
                    <div className="row">
                      <div className="col-sm-6">
                        <div className="form-group">
                          <span className="form-label">Name</span>
                          <input className="form-control" type="text" placeholder="Enter your name" />
                        </div>
                      </div>
                      <div className="col-sm-6">
                        <div className="form-group">
                          <span className="form-label">Email</span>
                          <input className="form-control" type="email" placeholder="Enter your email" />
                        </div>
                      </div>
                    </div>
                    <div className="form-group">
                      <span className="form-label">Phone</span>
                      <input className="form-control" type="tel" placeholder="Enter your phone number" />
                    </div>
                    <div className="form-group">
                      <span className="form-label">Pickup Location</span>
                      <input className="form-control" type="text" placeholder="Enter ZIP/Location" />
                    </div>
                    <div className="form-group">
                      <span className="form-label">Destination</span>
                      <input className="form-control" type="text" placeholder="Enter ZIP/Location" />
                    </div>
                    <div className="row">
                      <div className="col-sm-5">
                        <div className="form-group">
                          <span className="form-label">Pickup Date</span>
                          <input className="form-control" type="date" required />
                        </div>
                      </div>
                      <div className="col-sm-7">
                        <div className="row">
                          <div className="col-sm-4">
                            <div className="form-group">
                              <span className="form-label">Hour</span>
                              <select className="form-control">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                                <option>7</option>
                                <option>8</option>
                                <option>9</option>
                                <option>10</option>
                                <option>11</option>
                                <option>12</option>
                              </select>
                              <span className="select-arrow" />
                            </div>
                          </div>
                          <div className="col-sm-4">
                            <div className="form-group">
                              <span className="form-label">Min</span>
                              <select className="form-control">
                                <option>05</option>
                                <option>10</option>
                                <option>15</option>
                                <option>20</option>
                                <option>25</option>
                                <option>30</option>
                                <option>35</option>
                                <option>40</option>
                                <option>45</option>
                                <option>50</option>
                                <option>55</option>
                              </select>
                              <span className="select-arrow" />
                            </div>
                          </div>
                          <div className="col-sm-4">
                            <div className="form-group">
                              <span className="form-label">AM/PM</span>
                              <select className="form-control">
                                <option>AM</option>
                                <option>PM</option>
                              </select>
                              <span className="select-arrow" />
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                    <div className="form-btn">
                      <button className="submit-btn">Book Now</button>
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
       
      </div>
            
        );
    }
}
