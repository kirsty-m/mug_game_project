import { useEffect, useState } from "react";

export default function Narrative({ games, location }) {
  const [dialogueOption, setDialogueOption] = useState({});

  useEffect(() => {
    getData();
  }, []);

  const getData = () => {
    fetch("/api/locations")
      .then((response) => {
        return response.json();
      })
      .then((data) => {
        setGame(data);
        console.log(data);
      })
      .catch((error) => {
        console.error("Error fetching game data:", error);
      });
  };

  return (
    <div className="narrative">
      <p>{location.description}</p>
      <p>Do you:</p>
    </div>
  );
}
