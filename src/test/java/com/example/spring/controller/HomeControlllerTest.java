

@SpringBootTest(webEnvironmnt = Spring)



class HomControllerTest{
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void hello(){
        ResponseEntity<String> response = restTemplate.getForEntity("/aws/v1",String.class);
        assertEquls("<h1>AWS 배포 V1</h1>"),response.getBody());
    }

}