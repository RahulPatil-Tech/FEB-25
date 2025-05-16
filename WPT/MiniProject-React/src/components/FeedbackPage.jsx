import React from 'react';
import Lottie from 'lottie-react';
import animationData from '../lottie-feedback.json';
import './Feedback.css';

export default function FeedbackPage() {
  const feedbacks = [
  {
    quote: "This platform helped reduce stress-related burnout across our entire department—our productivity has never been better.",
    name: "Sophia Bennett",
    location: "HR Director, Zenith Consulting",
    rating: 5,
  },
  {
    quote: "Our executives needed personalized wellness plans that fit global travel. The results went beyond expectations.",
    name: "Marcus Tan",
    location: "Chief Wellness Officer, CapitalEdge Bank",
    rating: 5,
  },
  {
    quote: "As a healthcare analytics firm, we're data-driven. The insights and recommendations were impressively precise and actionable.",
    name: "Alyssa Raines",
    location: "VP Operations, Meditech Advisors",
    rating: 5,
  },
  {
    quote: "We were skeptical at first, but this solution helped our team sleep better, eat better, and *show up* better. Game changer.",
    name: "Daniel Cho",
    location: "Senior Partner, Stratagem Group",
    rating: 4,
  },
  {
    quote: "Our consultants are constantly on the move. This system gave them sustainable routines, and it shows in our client outcomes.",
    name: "Rachel Gomez",
    location: "Team Lead, Lumen Strategy",
    rating: 5,
  },
  {
    quote: "An impressive AI-driven wellness platform—ideal for our hybrid teams. Employees love it, and so does HR.",
    name: "Edward Klein",
    location: "People & Culture, Horizon Bank",
    rating: 4,
  },
  {
  quote: "We integrated this into our leadership program and saw measurable improvements in cognitive energy and decision clarity.",
  name: "Priya Nair",
  location: "Executive Coach, Novus Talent Partners",
  rating: 5,
},
{
  quote: "Our legal team operates under high pressure—this service introduced structure and wellbeing in ways that actually stuck.",
  name: "Thomas Ekwueme",
  location: "Partner, Lexton & Gray LLP",
  rating: 4,
},
{
  quote: "Fantastic. Real-time feedback, personalized plans, and an elegant user experience. Worth every cent.",
  name: "Isabelle Moreau",
  location: "Wellness Director, Société Générale",
  rating: 5,
},
{
  quote: "Finally, a tool that aligns with our culture of high performance *and* personal sustainability.",
  name: "David Yoon",
  location: "Innovation Lead, Apex Capital Partners",
  rating: 5,
},
{
  quote: "One of the best investments we’ve made into workforce well-being. The executive team raves about it.",
  name: "Natalie Briggs",
  location: "Chief of Staff, Trident Group",
  rating: 5,
},
{
  quote: "The insight reports alone helped us reframe how we support our global workforce. It’s smart and scalable.",
  name: "Omar Al-Farsi",
  location: "Global HR Strategist, AlManar Holdings",
  rating: 5,
},
{
  quote: "Working with them was a strategic advantage—data-driven, results-focused, and deeply human-centered.",
  name: "Elena Papadakis",
  location: "VP, People Analytics, Citadel Technologies",
  rating: 5,
},
{
  quote: "They elevated our entire wellbeing strategy across five international offices. A game-changer.",
  name: "Mohammed Al Nasser",
  location: "Chief Operating Officer, Gulf First Bank",
  rating: 5,
},
{
  quote: "Their advisory helped us reduce health-related absenteeism by 18% in just two quarters.",
  name: "Charlotte Whitmore",
  location: "Global HR Director, Orion Legal Group",
  rating: 4,
},
{
  quote: "A refined platform, with concierge-level support and insights that translated into real cultural value.",
  name: "Jin Soo Park",
  location: "People Lead, AxisCore AI",
  rating: 5,
},
{
  quote: "We saw tangible productivity gains and positive behavioral change within the first month.",
  name: "Ravi Sethi",
  location: "Head of Operations, QuantumBridge Bank",
  rating: 5,
},
{
  quote: "From onboarding to execution, it was seamless. They understand enterprise needs better than most vendors.",
  name: "Angela Ruiz",
  location: "Director of Employee Success, Nexa Consulting",
  rating: 5,
}
  ];

   return (
    <>
      {/* ✅ Feedback Section */}
      <section className="feedback-section">
        <div className="lottie-wrapper">
          <Lottie animationData={animationData} loop={true} />
        </div>
        <h2 className="feedback-title">✨ What Our Clients Say</h2>
        <p className="feedback-subtitle">Real impact. Real stories.</p>
        <div className="feedback-grid">
          {feedbacks.map((fb, idx) => (
            <div
              className="feedback-card fade-in glass"
              key={idx}
              style={{ animationDelay: `${idx * 0.3}s` }}
            >
              <p className="feedback-quote">“{fb.quote}”</p>
              <div className="feedback-meta">
                <div>
                  <strong>{fb.name}</strong><br />
                  <span className="location">{fb.location}</span>
                </div>
                <div className="rating">{'⭐'.repeat(fb.rating)}</div>
              </div>
            </div>
          ))}
        </div>

        <svg className="bg-blob" viewBox="0 0 800 600" xmlns="http://www.w3.org/2000/svg">
          <g transform="translate(400,300)">
            <path d="M120,-132C151,-89,161,-44,160,5C159,54,147,107,114,137C81,167,27,173,-23,164C-73,154,-120,128,-143,88C-165,48,-163,-5,-144,-49C-125,-93,-89,-128,-47,-156C-5,-185,44,-207,92,-187C139,-167,186,-105,120,-132Z"
              fill="#e8f5e9" opacity="0.2" />
          </g>
        </svg>
      </section>
    </>
  );
}