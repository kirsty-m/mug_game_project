export default function Result({ selectedOption }) {
    return (
      <div className="result">
        {selectedOption && <p>{selectedOption.responseText}</p>}
      </div>
    );
  }
  