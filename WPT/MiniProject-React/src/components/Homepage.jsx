import React, { useEffect } from 'react';
import { Container, Row, Col, Card, Button } from 'react-bootstrap';
import AOS from 'aos';
import 'aos/dist/aos.css';
import './Homepage.css';
import '@fortawesome/fontawesome-free/css/all.min.css';

const Home = () => {
    useEffect(() => {
        AOS.init({ duration: 1000 });
    }, []);

    return (
        <div className="home-section">
            <div
                className="home-hero-background"
                style={{
                    backgroundSize: "cover",
                    backgroundPosition: "center",
                    backgroundRepeat: "no-repeat",
                    minHeight: "80vh",
                    display: "flex",
                    alignItems: "center",
                    color: "gray",
                    padding: "4rem 2rem",
                }}
            >
                <Container>
                    <h1 className="home-intro" data-aos="fade-down">Smart Investment Solutions for the Future</h1>
                    <p className="home-description" data-aos="fade-up">
                        Our bank-focused advisory platform helps you guide high-net-worth clients to make the right investment choices with confidence and security.
                    </p>
                </Container>
            </div>

            <Container>
                <Row className="mt-5">
                    {[
                        {
                            title: 'Real-time Market Insights',
                            icon: 'fa-chart-line',
                            text: 'Stay ahead with live data and trends from the financial world.'
                        },
                        {
                            title: 'Client-Centric Dashboard',
                            icon: 'fa-gauge-high',
                            text: 'Track performance and investment health with a clean, intuitive UI.'
                        },
                        {
                            title: 'Secure Transactions',
                            icon: 'fa-lock',
                            text: 'Bank-grade security ensures all client data and activities are safe.'
                        },
                        {
                            title: 'AI-Driven Analytics',
                            icon: 'fa-robot',
                            text: 'Use powerful algorithms to predict trends and guide your decisions.'
                        },
                        {
                            title: '24/7 Expert Support',
                            icon: 'fa-headset',
                            text: 'Access dedicated advisors any time you or your clients need help.'
                        },
                        {
                            title: 'Custom Investment Strategies',
                            icon: 'fa-lightbulb',
                            text: 'Tailor solutions that align with each client’s goals and risk profile.'
                        }
                    ].map((item, index) => (
                        <Col md={4} className="mb-4" key={index} data-aos="zoom-in">
                            <Card className="home-card">
                                <Card.Body>
                                    <Card.Title>
                                        <i className={`fas ${item.icon} icon-style`}></i> {item.title}
                                    </Card.Title>
                                    <Card.Text>{item.text}</Card.Text>
                                </Card.Body>
                            </Card>
                        </Col>
                    ))}
                </Row>

                <div className="cta-section" data-aos="fade-up">
                    <h3>Ready to Empower Your Clients?</h3>
                    <p>Join our platform and start building smarter portfolios today.</p>
                    <Button variant="primary">Get Started</Button>
                </div>
            </Container>
        </div>
    );
};

export default Home;
