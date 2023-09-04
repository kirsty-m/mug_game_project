

export default function Narrative() {
  const [location, setLocation] = useState("");
  const [dialogueOption, setDialogueOption] = useState("");

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
      })
      .catch((error) => {
        console.error("Error fetching game data:", error);
      });
  };


    return (
    <div className="narrative">
        <p><text>Today has been a long day. Upon entering your cosy apartment, a sigh of relief escapes you as you drop your work bag on the floor. The day has felt incredibly long.</text></p>
        
        <p>Do you:</p>
    </div>
    )
}
