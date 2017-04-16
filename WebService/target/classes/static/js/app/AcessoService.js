'use strict';

angular.module('acessoApp').factory('AcessoService',
    ['$localStorage', '$http', '$q', 'urls',
        function ($localStorage, $http, $q, urls) {

            var factory = {
                loadAllAcessos: loadAllAcessos,
                getAllAcessos: getAllAcessos
            };

            return factory;

            function loadAllAcessos() {
                console.log('Fetching all acess');
                var deferred = $q.defer();
                $http.get(urls.ACESSO_SERVICE_API)
                    .then(
                        function (response) {
                            console.log('Fetched successfully all users');
                            $localStorage.acessos = response.data;
                            deferred.resolve(response);
                        },
                        function (errResponse) {
                            console.error('Error while loading users');
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }

            function getAllAcessos(){
                return $localStorage.acessos;
            }

        }
    ]);