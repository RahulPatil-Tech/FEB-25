import React from "react";
import { FaArrowLeft } from "react-icons/fa";
import "react-responsive-carousel/lib/styles/carousel.min.css";
import { Carousel } from "react-responsive-carousel";
import "./AboutUs.css";
import PratikImg from '../assets/images/Pratik.jpeg';
import PoojaImg from '../assets/images/Pooja.jpeg';
import RahulImg from '../assets/images/Rahul.jpeg';
import img1 from '../assets/investment-advisor1.jpg';
import img2 from '../assets/Caraousel2.jpg';
import img3 from '../assets/caraousel3.jpg';

//import car1 from "./Public/investment-advisor1.jpg";


const teamMembers = [
  {
    name: "Pratik Jadhav",
    role: "Developer",
    image: PratikImg,
  },
  {
    name: "Pooja Kore",
    role: "Developer",
    image: PoojaImg
  },
  {
    name: "Rahul Patil",
    role: "Developer",
    image: RahulImg,
  },
];

const AboutUs = () => {
  return (
    <div className="about-container">
      {/* Company Carousel Section */}
      <section className="section company-section">
        <div className="car">
          <Carousel
            showThumbs={false}
            autoPlay
            infiniteLoop
            showStatus={false}
            interval={3000}
          >
            <div>
              <img src={img1} alt="Empowering Clients" />
              <p className="legend">Empowering Clients</p>
            </div>
            <div>
              <img src={img2} alt="Tailored Solutions" />
              <p className="legend">Tailored Solutions</p>
            </div>
            <div>
              <img src={img3} alt="Proven Expertise" />
              <p className="legend">Proven Expertise</p>
            </div>
          </Carousel>
        </div>
      </section>

      {/* Team Section */}
      <section className="section team-section">
        <h2>Meet Our Team</h2>
        <div className="team-grid">
          {teamMembers.map((member, index) => (
            <div className="team-member" key={index}>
              <img src={member.image} alt={member.name} />
              <h4>{member.name}</h4>
              <p>{member.role}</p>
            </div>
          ))}
        </div>
      </section>

      {/* Why Choose Us Section */}
      <section className="section why-us-section">
        <h2>Why Choose Us?</h2>
        <ul>
          <li>✔ Trusted by top organizations and professionals</li>
          <li>✔ Transparent, ethical, and client-focused</li>
          <li>✔ Custom solutions tailored to your needs</li>
          <li>✔ Proven track record of success</li>
        </ul>
      </section>
    </div>
  );
};

export default AboutUs;