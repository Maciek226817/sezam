using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Ball : MonoBehaviour {

    // metoda Start() wywoływana jest przy inicjalizacji obiektu
    void Start() {
        // ustawienie obiektu w pozycji (0, 0, 0)
        transform.position = new Vector3(0.0f, 0.0f, 0.0f);
    }
}