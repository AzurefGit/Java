package z5;

public class TemperatureSensor implements Sensor{
    @Override
    public double readValue() {
        return 0;
    }

    @Override
    public String getStatus() {
        return  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras finibus mauris eget ipsum dignissim molestie.\n Curabitur non hendrerit turpis. Aenean sed turpis at orci hendrerit volutpat id tincidunt nibh. Proin urna tortor, ullamcorper eget est ut, maximusn\n posuere massa. Sed blandit sem eget dui ullamcorper tincidunt. Morbi vitae molestie nulla, sed pellentesque lectus. Cras pellentesque laoreet dolor vestibulum blandit. Ut sed purus\n ac diam varius euismod quis ac diam. Pellentesque tincidunt sed ipsum at tincidunt. Vestibulum tincidunt condimentum volutpat. Proin in placerat tellus. Quisque vehicula suscipit enim, vitae tincidunt arcu pulvinar ac. \nAenean pellentesque lacus eu leo hendrerit consectetur. Phasellus rutrum feugiat pretium. Mauris molestie eget mauris id euismod. Ut lobortis diam at quam faucibus semper." +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent consectetur malesuada iaculis. In ac tincidunt orci, \n et dignissim quam. Pellentesque auctor nulla ultricies, gravida turpis eu, feugiat mauris. Donec pharetra mauris dolor, ut vehicula dui eleifend\n ut. Quisque velit ante, dignissim sed convallis at, laoreet a metus. Integer in enim lectus. Sed a enim vitae mi maximus varius vel tristique nulla. \nIn laoreet felis purus, non pellentesque lorem aliquam vel. Phasellus rhoncus bibendum commodo. Quisque viverra eros eget justo tincidunt, convallis finibus felis\n tempus. Quisque laoreet felis sapien, non efficitur justo accumsan bibendum." +
                "Suspendisse eleifend elit sed mi commodo imperdiet. Proin metus elit, interdum nec tortor et, euismod efficitur ipsum. Nullam id malesuada ante. Praesent nulla tellus, volutpat sed sem a, tristique rutrum lectus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Proin tempus mattis orci vitae dignissim. In sagittis dignissim tellus, vitae accumsan mi sodales sed. Nunc finibus rhoncus risus, nec iaculis leo iaculis a. Sed ac porttitor tortor. Duis facilisis gravida enim, in iaculis enim pulvinar sed. Suspendisse pharetra, lacus varius dignissim pellentesque, elit dolor dignissim ligula, nec hendrerit erat nisl vel ligula. Nunc placerat tellus hendrerit dapibus tempus. Nulla sed ultricies est, eget tempor massa. Morbi euismod sagittis ante, a volutpat lorem hendrerit non.\n" +
                "Nunc sed eros quis risus varius accumsan sit amet quis erat. Pellentesque sed ligula quis massa dapibus bibendum ac fermentum sem. Vivamus ultrices laoreet mauris efficitur egestas. Praesent egestas odio id pretium cursus. Ut eu magna at enim fringilla sollicitudin. Nunc sit amet metus et felis vehicula viverra hendrerit non ligula. Quisque vitae bibendum mi. Sed quam turpis, cursus at vestibulum vitae, ornare et ex. Integer eget egestas eros, et fringilla nibh.\n" +
                "Mauris at lacinia justo. Integer molestie justo id iaculis venenatis. Nullam ut venenatis lectus, pellentesque efficitur leo. Duis nec mattis lacus. Aenean nisi justo, fermentum et velit nec, porttitor tincidunt odio. Duis eu velit nec sapien egestas venenatis. Suspendisse vitae pharetra turpis, sit amet porta massa. Nulla consequat suscipit vulputate. Fusce quis neque vel magna mattis aliquam. Pellentesque ullamcorper molestie porta. Sed posuere elementum feugiat. ";
    }

    @Override
    public void reset() {
        System.out.println("Resetowanie");
    }
}
